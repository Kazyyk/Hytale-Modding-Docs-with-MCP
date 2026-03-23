# ClimateGraph

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateGraph

Precomputed 2D lookup table that maps temperature-humidity coordinates to climate types. Operates on a fixed 512x512 resolution grid. Builds the lookup table using distance transforms and fade blending at climate boundaries. Supports parent-child climate hierarchies for smooth transitions between biome regions.
