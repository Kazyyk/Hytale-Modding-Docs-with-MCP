# ProcessingBench

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.bench | Extends: Bench

public class ProcessingBench extends Bench

Bench subclass for time-based processing operations such as smelting or refining.

## Constants

- BuilderCodec<ProcessingBench> CODEC
- BuilderCodec<ProcessingBench.ExtraOutput> CODEC
- BuilderCodec<ProcessingBench.ProcessingSlot> CODEC

## Key Methods

- public String getIconItem()
- public String getIcon()
- public String getIconName()
- public String getIconId()
- public ProcessingBench.ProcessingSlot[] getInput(int tierLevel)
- public ProcessingBench.ProcessingSlot[] getFuel()
- public int getMaxFuel()
- public String getFuelDropItemId()
- public int getOutputSlotsCount(int tierLevel)
- public ProcessingBench.ExtraOutput getExtraOutput()
- public String getEndSoundEventId()
- public int getEndSoundEventIndex()
- public boolean shouldAllowNoInputProcessing()
- public boolean equals(Object o)
- public int hashCode()
- public MaterialQuantity[] getOutputs()
- public int getPerFuelItemsConsumed()
- public boolean isIgnoredFuelSource(Item id)
- public boolean equals(@Nullable Object o)
- public String getResourceTypeId()
- public boolean shouldFilterValidIngredients()
