# ChangeFarmingStageInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class ChangeFarmingStageInteraction extends SimpleBlockInteraction

Block interaction that advances a farming block to its next growth stage. Validates the target block has farming data and a valid next stage, then applies the stage transition via `FarmingStageData.apply()`.
