#include <stdio.h>

class Balls {
        public:
                Balls(void(*fp)(int, int)){
                        take_action = fp;
                }
                void send_data(){
                        printf("in send_data()\n");
                        take_action(4,5);
                }
                static void laugh(){
                        printf("laughing :O :)\n");
                }
        private:
                void(*take_action)(int, int);

};

void take_action(int command, int payload){
        printf("in take_action\n");
        printf("%d : %d\n", command, payload);
        Balls::laugh();
}


int main(){
        Balls b1(take_action);
        b1.send_data();
}
