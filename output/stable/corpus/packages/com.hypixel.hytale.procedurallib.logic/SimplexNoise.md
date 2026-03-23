# SimplexNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class SimplexNoise implements NoiseFunction

Simplex gradient noise implementation (2D and 3D). Uses `GeneralNoise` hash and gradient functions. The singleton `INSTANCE` field provides the shared instance. Output is scaled by 50.0 (2D) or 32.0 (3D).

## Constants

- public static final SimplexNoise INSTANCE

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
