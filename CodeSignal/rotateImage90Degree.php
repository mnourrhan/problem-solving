<?php

function rotateImage($a){
	 for($i = 0; $i < count($a); $i++) {
	    for($j = $i+1; $j < count($a); $j++) {
	    	$temp = $a[$i][$j];
	    	$a[$i][$j] = $a[$j][$i];
	    	$a[$j][$i] = $temp;
	    }
	}
	$a_length = count($a);
	for($i = 0; $i < count($a); $i++) {
	    for ($j = 0; $j < $a_length/2; $j += 1) {
	    	$temp = $a[$i][$j];
	    	$a[$i][$j] = $a[$i][$a_length-1-$j];
	    	$a[$i][$a_length-1-$j] = $temp;
	    }
	}

	return $a;
}

$rotated = rotateImage([[1,2,3], [4,5,6], [7,8,9]]);
for ($row = 0; $row < count($rotated); $row++) {
  for ($col = 0; $col < count($rotated); $col++) {
    echo $rotated[$row][$col] . "," ;
  }
  echo "\n";
}
