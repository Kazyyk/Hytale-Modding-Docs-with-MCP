# SuppressionSpanHelper

Type: class | Package: com.hypixel.hytale.server.spawning.suppression

public class SuppressionSpanHelper

Class in the suppression subsystem.

## Fields

- currentSpanIndex | int | int field.

## Methods

- optimiseSuppressedSpans(int roleIndex, @Nullable ChunkSuppressionEntry entry) | void | public method.
- adjustSpawnRangeMin(int min) | int | public method.
- adjustSpawnRangeMax(int min, int max) | int | public method.
- reset() | void | public method.
- allocateSpan(@Nonnull ArrayDeque<SuppressionSpanHelper.Span> spanPool) | SuppressionSpanHelper.Span | static private method.
