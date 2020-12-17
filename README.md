## java-examples
Repository with small Java programs to apply O.O concepts.

# compile  
sudo docker run --rm -v "$PWD":/usr/src/hello-docker -w /usr/src/hello-docker openjdk:8 javac Main.java

# run 
sudo docker run --rm -v "$PWD":/usr/src/hello-docker -w /usr/src/hello-docker openjdk:8 java Main.java