# SeedResource

Type: interface | Package: com.hypixel.hytale.procedurallib.json

public interface SeedResource

Interface for seed-based procedural generation resources. Provides thread-local result buffers for 2D and 3D noise computation, and optional seed reporting for debugging. All methods have default implementations.

## Thread-Local Buffers

- localBounds2d() | ResultBuffer.Bounds2d | Thread-local 2D bounds buffer.
- localBuffer2d() | ResultBuffer.ResultBuffer2d | Thread-local 2D result buffer.
- localBuffer3d() | ResultBuffer.ResultBuffer3d | Thread-local 3D result buffer.

## Seed Reporting

- shouldReportSeeds() | Returns `false` by default. Override to enable seed reporting.
- reportSeeds(int seedVal, String original, String seed, @Nullable String overwritten) | Logs seed values when reporting is enabled.
- writeSeedReport(String seedReport) | Writes to `System.out` by default.

## Constants

- INFO_SEED_REPORT | "Seed Value: %s for seed %s / %s"
- INFO_SEED_OVERWRITE_REPORT | "Seed Value: %s for seed %s / %s overwritten by %s"

## Related Types

- SeedString -- wraps this interface with seed string data
- SeedResourcePointGenerator -- point generator delegating buffers to this resource
