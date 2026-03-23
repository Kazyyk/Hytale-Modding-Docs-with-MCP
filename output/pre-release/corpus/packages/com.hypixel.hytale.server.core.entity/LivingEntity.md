# LivingEntity

Type: class | Package: com.hypixel.hytale.server.core.entity | Extends: Entity

public abstract class LivingEntity extends Entity

Abstract base class for entities with health, inventory, equipment, and stat modifiers. Extends `Entity` and adds an `Inventory` (deserialized via codec), a `StatModifiersManager` for equipment-based stat calculations, fall distance tracking, and armor inventory change event handling. Subclasses must implement `createDefaultInventory()`. Provides breathing logic that checks invulnerability and fluid/material state.
