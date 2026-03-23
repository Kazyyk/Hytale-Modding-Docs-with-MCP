# HarvestCropInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class HarvestCropInteraction extends SimpleBlockInteraction

Harvests resources from a farmable block by delegating to FarmingUtil.harvest. Optionally requires the held item to not be broken (`RequireNotBroken`). Resolves the block type and rotation from the world chunk, then calls the utility harvest method.
