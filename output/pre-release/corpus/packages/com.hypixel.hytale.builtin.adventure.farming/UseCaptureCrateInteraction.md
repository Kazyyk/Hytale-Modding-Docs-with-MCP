# UseCaptureCrateInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseCaptureCrateInteraction extends SimpleBlockInteraction

Dual-purpose interaction for capture crates. When used on an NPC entity (tick0), captures the NPC into the held item's metadata as `CapturedNPCMetadata`. When used on a block (interactWithBlock), either places the captured NPC into a CoopBlock or releases it into the world. Validates NPC groups against `acceptedNpcGroupIds`.
