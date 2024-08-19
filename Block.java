import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Block {

    /**
     * Collects the transaction strings into one string.
     *
     * @param previous_block_hash the hash of the previous block
     * @param transaction_list the list of the transaction strings of the current block
     * @return a single string of the transaction-list strings and the previous block's hash
     */
    public String block_data(String previous_block_hash, String[] transaction_list) {

        return previous_block_hash 
        + "->" 
        + "".join("->", transaction_list);
    }


    /**
     * Calculates the hash of a block.
     *
     * @param block_data the single string containing of the list of transaction and the previous block's hash
     * @return a string of the hexadecimal version of the hash byte
     * @throws NoSuchAlgorithmException if the algorithm doesnt exist???
     */
    public String block_hash(String block_data) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256"); // Create a MessageDigest instance for SHA-256 (a hash algorithm)
        byte[] hashBytes = digest.digest(block_data.getBytes());  // Perform the hash computation

        // Convert the byte array to a hexadecimal string using a format method
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }

        return hexString.toString();
    }



    


}
