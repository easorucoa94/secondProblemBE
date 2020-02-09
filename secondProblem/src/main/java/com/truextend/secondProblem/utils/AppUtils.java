package com.truextend.secondProblem.utils;

import java.math.BigDecimal;
import java.util.HashMap;

import com.truextend.secondProblem.AppVariables;

public class AppUtils {

	public static BigDecimal convertLatitudeToMeters(Double dLatitude) {
		return new BigDecimal(AppVariables.metersForEveryLatitudeDegree * dLatitude);
	}

	public static BigDecimal convertLongitudeToMeters(Double dLongitude) {
		return new BigDecimal(AppVariables.metersForEveryLongitudeDegree * dLongitude);
	}

	public static HashMap<String, HashMap<String, BigDecimal>> getStartAndEndPositionsByCenterPosition(
			Double dLongitude, Double dLatitude) {
		HashMap<String, HashMap<String, BigDecimal>> positionsObject = new HashMap<String, HashMap<String, BigDecimal>>();
		HashMap<String, BigDecimal> startPosition = new HashMap<String, BigDecimal>();
		HashMap<String, BigDecimal> endPosition = new HashMap<String, BigDecimal>();
		Double roomSquareMeters = AppVariables.classSquareMeters;
		BigDecimal roomDimensionHalfMeters = new BigDecimal(roomSquareMeters / 2);
		BigDecimal longitudeMeters = convertLongitudeToMeters(dLongitude);
		BigDecimal latitudeMeters = convertLatitudeToMeters(dLatitude);

		startPosition.put("dLongitudePosition", longitudeMeters.subtract(roomDimensionHalfMeters));
		startPosition.put("dLatitudePosition", latitudeMeters.add(roomDimensionHalfMeters));
		endPosition.put("dLongitudePosition", longitudeMeters.add(roomDimensionHalfMeters));
		endPosition.put("dLatitudePosition", latitudeMeters.subtract(roomDimensionHalfMeters));

		positionsObject.put("startPosition", startPosition);
		positionsObject.put("endPosition", endPosition);

		return positionsObject;
	}
	
	public static HashMap<String, BigDecimal> getPositionByLatitudeAndLongitude(Double dLongitude, Double dLatitude) {
		HashMap<String, BigDecimal> positionObject = new HashMap<String, BigDecimal>();
		
		BigDecimal longitudeMeters = convertLongitudeToMeters(dLongitude);
		BigDecimal latitudeMeters = convertLatitudeToMeters(dLatitude);
		
		positionObject.put("dLongitudePosition", longitudeMeters);
		positionObject.put("dLatitudePosition", latitudeMeters);
		
		return positionObject;
	}
}
