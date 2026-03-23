# ChunkSuppressionEntry

Type: class | Package: com.hypixel.hytale.server.spawning.suppression.component | Implements: Component<ChunkStore>

public class ChunkSuppressionEntry implements Component<ChunkStore>

Implementation of `Component<ChunkStore>`.

## Fields

- suppressionSpans | List<ChunkSuppressionEntry.SuppressionSpan> | final List<ChunkSuppressionEntry.SuppressionSpan> field.

## Constructors

- ChunkSuppressionEntry(@Nonnull List<ChunkSuppressionEntry.SuppressionSpan> suppressionSpans) | Creates a new ChunkSuppressionEntry instance.

## Methods

- getComponentType() | ComponentType<ChunkStore, ChunkSuppressionEntry> | static public method.
- getSuppressionSpans() | List<ChunkSuppressionEntry.SuppressionSpan> | public method.
- containsOnly(UUID suppressorId) | boolean | public method.
- isSuppressingRoleAt(int roleIndex, int yPosition) | boolean | public method.
- clone() | Component<ChunkStore> | public method.
