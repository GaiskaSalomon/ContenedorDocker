  # Use the OpenJDK 18 image as the base image
  FROM openjdk:18

  # Create a new app directory for my application files that will live inside on my container not inside my machine
  # Run only apply to images
  RUN mkdir /app

  # Copy the app files from host machine into image filesystem
  # Copy 1st argument apply to host machine and second one to my image
  COPY out/production/Docker/ /app

  # Set the directory for executing future commands
  WORKDIR /app

  # Run the Main class
  CMD java Main