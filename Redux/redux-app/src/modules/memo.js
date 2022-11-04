//메모배열 저장
// 초기값 

const initalState = {
    memolist : [
        {
            id : 1,
            title : "누가 내 치즈를 먹었냐 ㅅㅂ",
            text : "내가 좋아하는 치지으치치치치치치치즈"
        },
    ],
    id : 2
}
// 액션타입을 함수로 만들어 내보내어줌
export const addmemo= (memo)=> ({type:"addMemo", payload:memo}) 

// deltememo에서 받아오는 매개변수 id는 3과 같은 숫자값을 사용할 예정
export const deletememo = (id) => ({type:"deleteMemo", payload : id})
// 리듀서값 작성

function memo(state=initalState, action) {
    switch (action.type) {
        // 새로운 메모를 생성 
        case "addMemo" : 
        const newMomo = {
            id : state.id,
           title : action.payload.title,
           text : action.payload.text
        }

        // 새로운 메모를 가지는 리스트 
        const newMemoList = state.memolist.concat(newMomo)
        return  {...state, memolist : newMemoList, id:state.id+1 }

       
        case "deleteMemo":
            // memo id를 가져와서, id값을 가진 메모를 제외하고 새로운 메모리스트생성
            return {
                ...state,
                                        // payload:3 (id값 하나만 들어가 있음)
                memolist : state.memolist.filter((memo)=>memo.id != action.payload)
            }
        default:
            return state;

    }
}

export default memo; 