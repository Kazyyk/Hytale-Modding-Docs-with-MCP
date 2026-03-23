# BlockWindow

Type: abstract class | Package: com.hypixel.hytale.server.core.entity.entities.player.windows | Extends: Window | Implements: ValidatedWindow

public abstract class BlockWindow extends Window implements ValidatedWindow

## Fields

- private static final float MAX_DISTANCE
- protected final int x
- protected final int y
- protected final int z
- protected BlockType blockType
- protected final int rotationIndex
- private double maxDistance
- private double maxDistanceSqr

## Methods

- public int getX()
- public int getY()
- public int getZ()
- public int getRotationIndex()
- @Nonnull public BlockType getBlockType()
- public void setMaxDistance(double maxDistance)
- public double getMaxDistance()
- @Override public boolean validate(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> store)

Known subclasses: BenchWindow, ContainerBlockWindow

Also in this package: ContainerBlockWindow, ContainerWindow, ItemContainerWindow, ItemStackContainerWindow, MaterialContainerWindow, MaterialExtraResourcesSection, ValidatedWindow, Window, WindowCloseEvent, WindowManager

Complete API:
  public int getX()
  public int getY()
  public int getZ()
  public int getRotationIndex()
  public BlockType getBlockType()
  public void setMaxDistance(double maxDistance)
  public double getMaxDistance()
  public boolean validate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> store)

Fields:
private static final float MAX_DISTANCE
protected final int x
protected final int y
protected final int z
protected BlockType blockType
protected final int rotationIndex
private double maxDistance
private double maxDistanceSqr
