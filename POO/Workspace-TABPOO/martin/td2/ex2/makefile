CC=gcc
CFLAGS=-Wall -std=c90 -pedantic -g
LDFLAGS=-L/home/richardm/Documents/libdyn/ -ldeque -lpile -lfile
OBJ_DIR=binary-tree/obj
SRC_DIR=binary-tree/src
EXEC_DIR=.
SRC= $(wildcard $(SRC_DIR)/*.c)
#OBJ= $(SRC:.c=.o)
OBJ=$(patsubst $(SRC_DIR)/%.c,$(OBJ_DIR)/%.o,$(SRC))
#EXEC= $(SRC:.c=)
#EXEC=$(patsubst $(SRC_DIR)/%.c,./%,$(SRC))
EXEC=test-tree 
INCLUDE=-I/home/richardm/Documents/header/

all: $(EXEC)

#$(EXEC): %: %.o
$(EXEC): $(OBJ)
	$(CC) -o $(EXEC_DIR)/$@ $^ $(LDFLAGS)

$(OBJ_DIR)/%.o: $(SRC_DIR)/%.c
	$(CC) $(CFLAGS) -o $@ -c $< $(INCLUDE)

clean:
	rm -rf $(OBJ_DIR)/*.o

mrproper : clean
	rm -rf $(EXEC)









