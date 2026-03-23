# Simplex

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise | Extends: java.lang.Object

class Simplex

Package-private pure simplex noise implementation providing static methods for 2D, 3D, and 4D noise evaluation. This is a standard simplex noise algorithm using gradient tables and a 256-entry permutation table. Used internally by SimplexNoiseField for per-octave noise evaluation.

This class has package-private visibility and is not intended for direct external use.

## Algorithm Details

The implementation uses the standard simplex noise algorithm:

- **2D:** Skewing factor `F2 = 0.5 * (sqrt(3) - 1)`, unskewing factor `G2 = (3 - sqrt(3)) / 6`. Uses 12 gradient vectors from `grad3`. Output scaled by 70.
- **3D:** Skewing factor `F3 = 1/3`, unskewing factor `G3 = 1/6`. Uses 12 gradient vectors from `grad3`. Output scaled by 32.
- **4D:** Skewing factor `F4 = (sqrt(5) - 1) / 4`, unskewing factor `G4 = (5 - sqrt(5)) / 20`. Uses 32 gradient vectors from `grad4`. Output scaled by 27.

All variants use a shared 256-entry permutation table (`p`) expanded into `perm` (512 entries) and `permMod12` (512 entries) at class initialization.

## Static Methods


public static double noise(double xin, double yin)

Evaluates 2D simplex noise at the given coordinates. Returns a value in the approximate range [-1, 1].


public static double noise(double xin, double yin, double zin)

Evaluates 3D simplex noise at the given coordinates. Returns a value in the approximate range [-1, 1].


public static double noise(double x, double y, double z, double w)

Evaluates 4D simplex noise at the given coordinates. Returns a value in the approximate range [-1, 1].

## Inner Classes

### Grad


private static class Grad

Gradient vector with up to 4 components (`x`, `y`, `z`, `w`). Used internally by the simplex noise algorithm for dot product calculations against simplex corner offsets.

- x | double | X component of the gradient.
- y | double | Y component of the gradient.
- z | double | Z component of the gradient.
- w | double | W component of the gradient (4D only).

## See Also

- SimplexNoiseField -- uses this class for per-octave noise sampling
- NoiseField -- abstract base class for all noise fields
