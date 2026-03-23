# BlockSelection

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.standard | Implements: NetworkSerializable<EditorBlocksChange>, MetricProvider

public class BlockSelection implements NetworkSerializable<EditorBlocksChange>, MetricProvider

Core data structure representing a 3D selection of blocks, fluids, and entities. Supports placing into worlds, rotating, flipping, iterating blocks/fluids/entities, anchor positioning, and clipboard operations. Thread-safe with read-write locks for both block and entity data.
