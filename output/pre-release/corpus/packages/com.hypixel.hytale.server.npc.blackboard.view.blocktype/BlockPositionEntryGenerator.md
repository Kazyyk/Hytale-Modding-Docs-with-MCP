# BlockPositionEntryGenerator

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.blocktype

public class BlockPositionEntryGenerator

Generates blackboard entries for block positions of specific block types, used by NPC AI to track relevant blocks in the environment.

Also in this package: BlockTypeView, BlockTypeViewManager, FoundBlockConsumer

Complete API:
  public BlockPositionProvider generate(short changeCounter, int sectionIndex, BlockChunk chunk, IntList unifiedBlocksOfInterest, BitSet searchedBlockSets)

Fields:
private final BlockPositionEntryGenerator.FoundBlockConsumer foundBlockConsumer
