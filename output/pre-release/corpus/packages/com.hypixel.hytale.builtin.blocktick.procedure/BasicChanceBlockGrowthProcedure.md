# BasicChanceBlockGrowthProcedure

Type: class | Package: com.hypixel.hytale.builtin.blocktick.procedure | Extends: TickProcedure

public class BasicChanceBlockGrowthProcedure extends TickProcedure

## Fields

- public static final BuilderCodec<BasicChanceBlockGrowthProcedure> CODEC
- protected int chanceMin
- protected int chance
- protected String to
- protected boolean nextTicking

## Methods

- @Nonnull @Override public BlockTickStrategy onTick(World world, WorldChunk wc, int worldX, int worldY, int worldZ, int blockId)
- protected boolean runChance()
- protected boolean executeToBlock(World world, int worldX, int worldY, int worldZ, String to)
- @Nonnull @Override public String toString()

Known subclasses: SplitChanceBlockGrowthProcedure

Also in this package: SplitChanceBlockGrowthProcedure

Complete API:
  public BlockTickStrategy onTick(World world, WorldChunk wc, int worldX, int worldY, int worldZ, int blockId)
  protected boolean runChance()
  protected boolean executeToBlock(World world, int worldX, int worldY, int worldZ, String to)
  public String toString()

Fields:
public static final BuilderCodec<BasicChanceBlockGrowthProcedure> CODEC
protected int chanceMin
protected int chance
protected String to
protected boolean nextTicking
