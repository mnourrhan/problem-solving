<?php
// https://leetcode.com/problems/degree-of-an-array/submissions/
function findShortestSubArray($inputData) {
    $arr = explode(' ', $inputData);
    $arrDegree= -1;
    $arr_hash = array();
    $minLength = count($arr);
    foreach($arr as $i => $element){
        if(array_key_exists($element, $arr_hash)){
            $arr_hash[$element] =  ['count' => $arr_hash[$element]['count'] + 1,
                'firstPos' => $arr_hash[$element]['firstPos'],
                'lastPos' => $i];
        }else{
            $arr_hash[$element] = ['count' => 1, 'firstPos' => $i, 'lastPos' => $i];
        }
    }
    foreach($arr_hash as $key => $data){
        $eleArrLength = $data['lastPos'] - $data['firstPos'] + 1;
        if($data['count'] > $arrDegree){
            $arrDegree = $data['count'];
            $minLength = $eleArrLength;
        }else if($data['count'] == $arrDegree && $eleArrLength < $minLength){
            $minLength = $eleArrLength;
        }
    }
    return $minLength;
}

echo findShortestSubArray('1 2 2 3 1 4 2');