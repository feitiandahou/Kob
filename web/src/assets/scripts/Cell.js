export class Cell{
    constructor(r,c){
        this.r = r;
        this.c = c;

        //转化为canvas的作表
        this.x = c + 0.5;
        this.y = r + 0.5;
    }
}