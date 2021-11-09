CC=gcc
CFLAGS=-Wall -std=c90 -pedantic -g
LDFLAGS=-lm
OBJ_DIR=obj
SRC_DIR=src
SRC= $(wildcard $(SRC_DIR)/*.c)
#OBJ= $(SRC:.c=.o)
OBJ=$(patsubst $(SRC_DIR)/%.c,$(OBJ_DIR)/%.o,$(SRC))
#EXEC= $(SRC:.c=)
#EXEC=$(patsubst $(SRC_DIR)/%.c,./%,$(SRC))
EXEC=test-mat
INCLUDE=-I$(OBJ_DIR)


all: $(EXEC)

#$(EXEC): %: %.o
$(EXEC): $(OBJ)
	$(CC) -o $@ $^ $(INCLUDE) $(LDFLAGS)

$(OBJ_DIR)/%.o: $(SRC_DIR)/%.c
	$(CC) $(CFLAGS) -o $@ -c $< 

clean:
	rm -rf $(OBJ_DIR)/*.o

mrproper : clean
	rm -rf $(EXEC)









