# DefaultEntityStatTypes

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public abstract class DefaultEntityStatTypes

Provides cached index lookups for the six built-in entity stat types. Indices are refreshed from the `EntityStatType` asset map on asset load events.

## Static Methods

- getHealth() | int | Index of the "Health" stat.
- getOxygen() | int | Index of the "Oxygen" stat.
- getStamina() | int | Index of the "Stamina" stat.
- getMana() | int | Index of the "Mana" stat.
- getSignatureEnergy() | int | Index of the "SignatureEnergy" stat.
- getAmmo() | int | Index of the "Ammo" stat.
- update() | void | Re-resolves all indices from the asset map. Called on startup and asset reload.
