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

Also in this package: Span, SpawnSuppressorEntry

Complete API:
  public void optimiseSuppressedSpans(int roleIndex, ChunkSuppressionEntry entry)
  public int adjustSpawnRangeMin(int min)
  public int adjustSpawnRangeMax(int min, int max)
  public void reset()
  private static SuppressionSpanHelper.Span allocateSpan(ArrayDeque<SuppressionSpanHelper.Span> spanPool)

Fields:
private static final ThreadLocal<ArrayDeque<SuppressionSpanHelper.Span>> SPAN_POOL
private final List<SuppressionSpanHelper.Span> optimisedSuppressionSpans
private int currentSpanIndex
