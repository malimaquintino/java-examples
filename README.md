## java-examples
Repository with small Java programs to apply O.O concepts.

# compilar  
sudo docker run --rm -v "$PWD":/usr/src/hello-docker -w /usr/src/hello-docker openjdk:8 javac Main.java

# executar 
sudo docker run --rm -v "$PWD":/usr/src/hello-docker -w /usr/src/hello-docker openjdk:8 java Main.java