# OldSimplexNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class OldSimplexNoise implements NoiseFunction

OpenSimplex-style noise implementation supporting 2D and 3D evaluation. Uses custom gradient tables (8 gradients for 2D, 24 for 3D) and stretch/squish constants. The singleton `INSTANCE` field provides the shared instance. Output is normalized by dividing by 47.0 (2D) or 103.0 (3D).

## Constants

- public static final OldSimplexNoise INSTANCE

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
