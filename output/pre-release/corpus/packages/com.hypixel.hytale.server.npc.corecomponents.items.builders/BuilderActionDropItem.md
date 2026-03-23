# BuilderActionDropItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items.builders | Extends: BuilderActionWithDelay

public class BuilderActionDropItem extends BuilderActionWithDelay

NPC behavior action builder for ActionDropItem functionality.

## Constants

- public static final double[] DEFAULT_THROW_DISTANCE
- public static final double[] DEFAULT_DROP_SECTOR

## Fields

- protected final AssetHolder item
- protected final AssetHolder dropList
- protected float throwSpeed
- protected double[] distance
- protected double[] dropSector
- protected boolean highPitch

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull public BuilderActionDropItem readConfig(@Nonnull JsonElement data)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
- public String getItem(@Nonnull BuilderSupport support)
- public String getDropList(@Nonnull BuilderSupport support)
- public float getThrowSpeed()
- public double[] getDropSectorRadians()
- public double[] getDistance()
- public boolean isHighPitch()

Also in this package: BuilderActionInventory, BuilderActionPickUpItem, BuilderSensorDroppedItem

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderActionDropItem readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public String getItem(BuilderSupport support)
  public String getDropList(BuilderSupport support)
  public float getThrowSpeed()
  public double[] getDropSectorRadians()
  public double[] getDistance()
  public boolean isHighPitch()

Fields:
public static final double[] DEFAULT_THROW_DISTANCE
public static final double[] DEFAULT_DROP_SECTOR
protected final AssetHolder item
protected final AssetHolder dropList
protected float throwSpeed
protected double[] distance
protected double[] dropSector
protected boolean highPitch
