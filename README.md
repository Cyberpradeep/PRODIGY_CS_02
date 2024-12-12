# PRODIGY_CS_02
# Image Encryption Tool in Java

This repository contains a simple image encryption tool in Java, which encrypts and decrypts images using pixel manipulation. The encryption is done using XOR with a key, and the same key is used for both encryption and decryption.

## Features:
- Encrypts and decrypts images using pixel manipulation.
- Uses XOR encryption, which is symmetric (the same key is used for both encryption and decryption).
- Works with PNG images (using `javax.imageio.ImageIO` for image input/output).

## How it Works:
- The image is read into memory.
- Each pixel's RGB values are XORed with a user-provided key.
- The modified image is saved as an encrypted/decrypted image.

## Prerequisites:
- Java Development Kit (JDK) 8 or later.
- No additional libraries are required (uses built-in Java libraries).

## Usage:
### Clone the repository:
```bash
git clone https://github.com/Cyberpradeep/image-encryption-java.git
