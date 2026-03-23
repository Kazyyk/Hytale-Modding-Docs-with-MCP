# SpreadToProcedure

Type: class | Package: com.hypixel.hytale.builtin.randomtick.procedures | Implements: RandomTickProcedure

public class SpreadToProcedure implements RandomTickProcedure

Implementation of `RandomTickProcedure`.

## Fields

- spreadDirections | Vector3i[] | Vector3i[] field.
- minY | int | int field.
- maxY | int | int field.
- allowedTag | String | String field.
- allowedTagIndex | int | int field.
- requireEmptyAboveTarget | boolean | boolean field.
- requiredLightLevel | int | int field.
- revertBlock | String | String field.

Also in this package: ChangeIntoBlockProcedure

Complete API:
  public void onRandomTick(Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer, BlockSection blockSection, int worldX, int worldY, int worldZ, int blockId, BlockType blockType)

Fields:
public static final BuilderCodec<SpreadToProcedure> CODEC
private Vector3i[] spreadDirections
private int minY
private int maxY
private String allowedTag
private int allowedTagIndex
private boolean requireEmptyAboveTarget
private int requiredLightLevel
private String revertBlock
