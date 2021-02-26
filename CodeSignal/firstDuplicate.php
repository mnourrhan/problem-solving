<?php
    function firstDuplicate($a) {
        $smallerDuplicateIndex = count($a);
        $smallerDuplicateElement = -1;
        $occurrenceArray = array();
        foreach($a as $index => $element){
            if(array_key_exists($element, $occurrenceArray)){
                if($index < $smallerDuplicateIndex){
                    $smallerDuplicateIndex = $index;
                    $smallerDuplicateElement = $element;
                }
            }
            $occurrenceArray[$element] = $element;
        }
        return $smallerDuplicateElement;
    } 
