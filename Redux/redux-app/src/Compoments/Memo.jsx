import { useCallback } from "react";
import { useEffect } from "react";
import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addmemo, deletememo } from "../modules/memo";

const Memo = () => {
    const memolist = useSelector((state)=>state.memo.memolist);
    
    // input tag 를 2개 만들어서 useState 로 title 과 text 값 받아오기 
    const [title,setTitle] = useState("");
    const [text,setText] = useState("");

    // useCallback을 사용해 줄때, 입력값이 있다면 입력값에 따라 바뀔수 있도록 추가
    // 매개변수로 받아오는 값은 고정되지 않음, 매개변수외의 값은 모두 고정 
    const dispatch = useDispatch(); 

    const addMemo= useCallback(()=>{ 
        console.log("확인");

        dispatch( addmemo( {title:title, text:text} ) )
    },[dispatch,title,text])

  const deleteMemo = useCallback((id)=>{
        dispatch(deletememo(id))
    },[dispatch])

    

        useEffect(
            ()=>{
                console.log(title,text)
    
            }
        )

    return ( 
        <div>
        <input type="text" onChange={(e)=>{setTitle(e.target.value)}}/>
        <input type="text" onChange={(e)=>{setText(e.target.value)}}/>
        <button onClick={addMemo}>메모</button>
        {   
            // map: 배열의 있는 요소들 가져와서 return하는 함수
            memolist.map((memo)=>(
                <div>
                    <h3>{memo.id}. {memo.title}</h3> 
                    <p>{memo.text}</p>
                    <button onClick={ ()=>{ deleteMemo(memo.id) }}>X</button>
                </div>
            ))
        }
    </div>

     );
}
 
export default Memo;