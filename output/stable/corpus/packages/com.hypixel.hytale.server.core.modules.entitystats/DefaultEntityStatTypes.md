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

Also in this package: EntityStatEffects, EntityStatType, EntityStatTypePacketGenerator, RegenType, Regenerating

Complete API:
  public static int getHealth()
  public static int getOxygen()
  public static int getStamina()
  public static int getMana()
  public static int getSignatureEnergy()
  public static int getAmmo()
  public static void update()

Fields:
private static int HEALTH
private static int OXYGEN
private static int STAMINA
private static int MANA
private static int SIGNATURE_ENERGY
private static int AMMO
