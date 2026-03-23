# MultipliedIteration

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null

public class MultipliedIteration

## Fields

- double candidate
- double currentSize
- int iterations

## Methods

- public static double calculateMultiplier(double startValue, double endValue, int numberOfIterations, double precision)
- throw new IllegalArgumentException("start smaller than end")
- throw new IllegalArgumentException("number of iterations must be greater than 0")
- throw new IllegalArgumentException("precision must be greater than 0")
- public static int calculateIterations(double multiplier, double startValue, double endValue)
