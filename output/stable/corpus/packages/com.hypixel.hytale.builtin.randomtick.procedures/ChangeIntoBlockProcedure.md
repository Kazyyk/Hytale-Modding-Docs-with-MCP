# ChangeIntoBlockProcedure

Type: class | Package: com.hypixel.hytale.builtin.randomtick.procedures | Implements: RandomTickProcedure

public class ChangeIntoBlockProcedure implements RandomTickProcedure

Implementation of `RandomTickProcedure`.

## Fields

- targetBlock | String | String field.

Also in this package: SpreadToProcedure

Complete API:
  public void onRandomTick(Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer, BlockSection blockSection, int worldX, int worldY, int worldZ, int blockId, BlockType blockType)

Fields:
public static final BuilderCodec<ChangeIntoBlockProcedure> CODEC
private String targetBlock
