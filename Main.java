import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Block blockInstance = new Block(); //Create an instance of the 'Block' class from the Block.java file

        // List of transactions; in a conventional blockchain, the transactions wont be strings
        String[] transactions1 = {"Anna sends 2.9 NC to Mike", "Bob sends 4.1 NC to Mike"}; 
        String[] transactions2 = {"Lol sends 23 NC to Fan", "Alice sends 8.9 NC to Bob"}; 
        String[] transactions3 = {"Anna sends 3.2 NC to Lol", "Fan sends 4.2 NC to Alice"}; 


        // The block chain:
        String block1_data = blockInstance.block_data(null, transactions1); // Genesis block
        String block1_hash = blockInstance.block_hash(block1_data);

        String block2_data = blockInstance.block_data(block1_hash, transactions2);
        String block2_hash = blockInstance.block_hash(block2_data);

        String block3_data = blockInstance.block_data(block2_hash, transactions3);
        String block3_hash = blockInstance.block_hash(block3_data);


        System.out.println(block1_data);
        System.out.println(block1_hash);

        System.out.println(block2_data);
        System.out.println(block2_hash);

        System.out.println(block3_data);
        System.out.println(block3_hash);
    }


}
