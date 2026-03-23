# UseWateringCanInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseWateringCanInteraction extends SimpleBlockInteraction

Waters a TilledSoilBlock by setting `wateredUntil` to the current game time plus the configured `Duration` (in seconds). If the target is a crop, looks one block below for the soil. Schedules a tick at the watering expiry time.
