Pattern 1 — Traversal
This is the easiest and most common.
Idea
Visit every character once.

Example
HELLO

H
E
L
L
O

Java
String s = "HELLO";

for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
}

Questions
- Count vowels
- Count consonants
- Count uppercase
- Count lowercase
- Count digits
- Count spaces
- Reverse string
- Print alternate characters
- Count words