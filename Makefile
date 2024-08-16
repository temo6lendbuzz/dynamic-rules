# Define variables
PROJECT_NAME=dynamic-rules
PORT=10500
CONTAINER_NAME=dynamic-rules-container

# .PHONY is used to specify that these are not files
.PHONY: build up down restart

# Target to build the Docker image
build:
	docker build -t $(PROJECT_NAME) .

# Target to run the Docker container in the background, depends on 'build'
up: build
	docker run -d -p $(PORT):8080 --name $(CONTAINER_NAME) $(PROJECT_NAME)

# Target to stop and remove the Docker container
down:
	docker stop $(CONTAINER_NAME) || true
	docker rm $(CONTAINER_NAME) || true

# Target to restart the application
restart: down up