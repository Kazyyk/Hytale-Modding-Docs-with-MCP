# BlockTickPlugin

Type: class | Package: com.hypixel.hytale.builtin.blocktick | Extends: JavaPlugin | Implements: IBlockTickProvider

public class BlockTickPlugin extends JavaPlugin implements IBlockTickProvider

## Fields

- private static BlockTickPlugin instance

## Methods

- public static BlockTickPlugin get()
- @Override protected void setup()
- @Override public TickProcedure getTickProcedure(int blockId)
- private void discoverTickingBlocks(ChunkPreLoadProcessEvent event)
- public int discoverTickingBlocks(Holder<ChunkStore> holder, WorldChunk worldChunk)

Complete API:
  public static BlockTickPlugin get()
  protected void setup()
  public TickProcedure getTickProcedure(int blockId)
  private void discoverTickingBlocks(ChunkPreLoadProcessEvent event)
  public int discoverTickingBlocks(Holder<ChunkStore> holder, WorldChunk worldChunk)

Fields:
private static BlockTickPlugin instance
