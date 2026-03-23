# BuilderActionTest

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.debug.builders | Extends: BuilderActionBase

public class BuilderActionTest extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- build(@Nonnull BuilderSupport builderSupport) | ActionTest | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionTest | public method.
- getBoolean(@Nonnull BuilderSupport support) | boolean | public method.
- getDouble(@Nonnull BuilderSupport support) | double | public method.
- getFloat(@Nonnull BuilderSupport support) | float | public method.
- getInt(@Nonnull BuilderSupport support) | int | public method.
- getString(@Nonnull BuilderSupport support) | String | public method.
- getEnum(@Nonnull BuilderSupport support) | RoleDebugFlags | public method.
- getEnumSet(@Nonnull BuilderSupport support) | EnumSet<RoleDebugFlags> | public method.
- getAsset(@Nonnull BuilderSupport support) | String | public method.
- getNumberArray(@Nonnull BuilderSupport support) | double[] | public method.
- getStringArray(@Nonnull BuilderSupport support) | String[] | public method.

Also in this package: BuilderActionLog, BuilderBodyMotionTestProbe

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public ActionTest build(BuilderSupport builderSupport)
  public BuilderActionTest readConfig(JsonElement data)
  public boolean getBoolean(BuilderSupport support)
  public double getDouble(BuilderSupport support)
  public float getFloat(BuilderSupport support)
  public int getInt(BuilderSupport support)
  public String getString(BuilderSupport support)
  public RoleDebugFlags getEnum(BuilderSupport support)
  public EnumSet<RoleDebugFlags> getEnumSet(BuilderSupport support)
  public String getAsset(BuilderSupport support)
  public double[] getNumberArray(BuilderSupport support)
  public String[] getStringArray(BuilderSupport support)

Fields:
protected final BooleanHolder booleanHolder
protected final DoubleHolder doubleHolder
protected final FloatHolder floatHolder
protected final IntHolder intHolder
protected final StringHolder stringHolder
protected final EnumHolder<RoleDebugFlags> enumHolder
protected final EnumSetHolder<RoleDebugFlags> enumSetHolder
protected final AssetHolder assetHolder
protected final NumberArrayHolder numberArrayHolder
protected final StringArrayHolder stringArrayHolder
