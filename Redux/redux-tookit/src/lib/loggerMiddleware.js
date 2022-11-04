
// store : 리덕스에서 가져온 store (state 와 dispatsh ) 
// next : dispatch 로 넘겨주는 역활
// action : dispath 에서 액션 
const loggerMiddleware = (store) => (next) => (action) => {
    // 액션의 상태를 남겨주는 역활

    console.group(action && action.type); 
    console.log ("이전상태" , store.getState())
    console.log ("액션" , action);
    // next() 를 통해서 액션을 실행해야지만 dispatch가 된다. 
    next(action);
    console.log ("다음상태" , store.getState());
    console.groupEnd();

}


// 위의 코드를 풀어쓴 모습 
const loggerMiddlewareFunc = function (store) {
    return function (next) {
        return function(action) {

        }
    }
}