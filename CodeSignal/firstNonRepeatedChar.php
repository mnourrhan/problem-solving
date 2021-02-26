<?php

function firstNotRepeatingCharacter($s) {
    $s_arr = str_split($s);
    $s_hash = array();
    $first_non_repeated_char = '_';
    foreach($s_arr as $index => $element){
        if(array_key_exists($element, $s_hash)){
            $s_hash[$element] = 1;
        }else{
            $s_hash[$element] = $s_hash[$element] + 1;
        }
    }
    foreach($s_hash as $key => $value){
        if($value == 1){
            $first_non_repeated_char = $key;
            break;
        }
    }
    return $first_non_repeated_char;
}

echo firstNotRepeatingCharacter("abacabad");