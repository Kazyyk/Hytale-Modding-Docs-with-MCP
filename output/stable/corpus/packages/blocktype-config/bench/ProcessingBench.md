# ProcessingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

Processing bench (furnace-like) with input/fuel slots, fuel management, and extra output configuration. Contains input and fuel `ProcessingSlot` arrays, max fuel, fuel drop item ID, output slot count, extra output config, icon properties, and end sound event. Inner class `ProcessingSlot` adds resource type filtering. Inner class `ExtraOutput` defines bonus outputs per fuel consumed.

Also in this package: Bench, BenchCategory, BenchItemCategory, BenchSlot, BenchTierLevel, BenchUpgradeRequirement, CraftingBench, DiagramCraftingBench, ExtraOutput, ProcessingSlot, StructuralCraftingBench

Complete API:
  public String getIconItem()
  public String getIcon()
  public String getIconName()
  public String getIconId()
  public ProcessingBench.ProcessingSlot[] getInput(int tierLevel)
  public ProcessingBench.ProcessingSlot[] getFuel()
  public int getMaxFuel()
  public String getFuelDropItemId()
  public int getOutputSlotsCount(int tierLevel)
  public ProcessingBench.ExtraOutput getExtraOutput()
  public String getEndSoundEventId()
  public int getEndSoundEventIndex()
  public boolean shouldAllowNoInputProcessing()
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<ProcessingBench> CODEC
protected ProcessingBench.ProcessingSlot[] input
protected ProcessingBench.ProcessingSlot[] fuel
protected boolean allowNoInputProcessing
protected ProcessingBench.ExtraOutput extraOutput
protected int maxFuel
protected String fuelDropItemId
protected int outputSlotsCount
protected String iconItem
protected String icon
protected String iconName
protected String iconId
protected String endSoundEventId
protected transient int endSoundEventIndex
