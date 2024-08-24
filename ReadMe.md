## How to run:

In the terminal, run:

```
javac Main.java
java Main
```


# Introduction to Blockchain: Theory and Structure

This document provides a simplified explanation of how blockchains work, using a basic example to illustrate the underlying principles. By understanding these concepts, we can better appreciate the technology behind cryptocurrencies and other blockchain-based systems.

## What is a Blockchain?

At its core, a blockchain is a distributed ledger that records transactions in a secure and transparent manner. The ledger is composed of a chain of blocks, each containing a list of transactions. What makes blockchain unique is its ability to maintain integrity and security through the use of cryptographic hashing.

## Basic Structure of a Blockchain

To explain how a blockchain works, let's consider a fictional cryptocurrency called **NeuralCoin**. We'll use this example to illustrate how transactions are recorded and secured within a blockchain.

### Example Transactions

Imagine the following transactions:

1. Anna sends Bob 2 NeuralCoins (NC).
2. Bob sends Daniel 4.3 NC.
3. Mark sends Charlie 3.2 NC.

These transactions can be grouped into a **block**. Let's call this the **initial block** (Block 1).

### Hashing and the Genesis Block

The first block in a blockchain is often referred to as the **genesis block**. Since it's the first block, it doesn't have a previous block to reference. For simplicity, let's say it has a "starting hash" like `AAA` (this could be any arbitrary value).

After grouping the transactions into Block 1, we calculate a hash for this block. In real-world blockchains, we commonly use the **SHA-256** hash function, but for this example, we’ll assume a simplified hash function. The resulting hash for Block 1 might look like `76fd89`.

### Adding More Blocks

Now, let's add more transactions:

- Transaction 4: Bob sends Eve 1 NC.
- Transaction 5: Daniel sends Alice 2.5 NC.
- Transaction 6: Charlie sends Mark 1.8 NC.

These transactions are grouped into **Block 2**. But before we calculate the hash for Block 2, we include the hash of Block 1 (`76fd89`) as part of the data for Block 2. This links Block 2 to Block 1, creating a **chain**.

After calculating the hash for Block 2, we might get a result like `8923ff`.

### Creating the Blockchain

This process continues as more blocks are added, each containing new transactions and referencing the hash of the previous block. The blockchain grows, and each block reinforces the security and integrity of the entire chain. 

For instance, Block 3 would include the hash of Block 2 (`8923ff`) along with its transactions. The hash of Block 3 would depend on both its own data and the hash of Block 2. In turn, the hash of Block 2 depends on both its own data and the hash of Block 1 etc.

Starting Hash ---> | Block 1 (bunch of transactions) | ---> Hash function ---> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Block 1 Hash ---> | Block 2 (bunch of transactions) | ---> Hash function ---> <br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Block 2 Hash ---> | Block 3 (bunch of transactions) | ---> Hash function ---> etc.

### Why the Blockchain is Secure

The security of the blockchain comes from its use of cryptographic hashing. Hash functions have a key property: **small changes in the input produce vastly different outputs**. For example, if you change the amount Anna sends Bob from 2 NC to 2.1 NC, the hash of Block 1 would change drastically. This change would then propagate through the entire blockchain, altering the hashes of all subsequent blocks.

Because each block contains the hash of the previous block, even a tiny modification to any block will break the chain, making it immediately apparent that the blockchain has been tampered with.

Altering a block undetected is computationally expensive because it requires recalculating the hash for the altered block and every subsequent block to maintain the chain's integrity, which demands an immense amount of computational power and time, making such attacks nearly impossible. The entire chain would need to be recomputed to maintain the integrity and consistency of the blockchain.

### Verifying Integrity

To verify the integrity of the blockchain, you only need to check the latest hash. If it matches the expected value, the entire chain is valid. If someone tries to alter a past transaction, the resulting mismatch in hashes will indicate that the blockchain has been compromised.

### Proof of Work (PoW)

Proof of Work (PoW) is a consensus mechanism used by many blockchains, including Bitcoin, to secure the network and validate transactions. Proof of Work (PoW) is a consensus mechanism that requires participants to solve complex mathematical puzzles to validate transactions and add new blocks to the blockchain (by mining), ensuring security by making it computationally expensive to alter the blockchain.

For an altered blockchain to be accepted by the network, the attacker would need to create a new chain that is longer (i.e., has more computational work) than the current valid chain. This involves not only recomputing all subsequent blocks but also outpacing the network’s combined computational power. This is extremely computationaly expensive.

### Conclusion

The fundamental idea behind a blockchain is to create a secure, tamper-proof ledger by chaining blocks together with cryptographic hashes. This structure ensures that once data is recorded, it cannot be altered without affecting the entire chain, making blockchain a reliable and transparent way to record and verify transactions.

Blockchain technology has far-reaching applications beyond cryptocurrencies, including supply chain management, secure voting systems, and decentralised finance (DeFi). Understanding the basic principles outlined here provides a foundation for exploring these exciting and transformative technologies.
