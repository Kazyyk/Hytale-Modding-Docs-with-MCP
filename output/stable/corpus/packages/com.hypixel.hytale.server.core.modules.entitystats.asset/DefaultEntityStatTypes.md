# DefaultEntityStatTypes

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset

public abstract class DefaultEntityStatTypes

Provides cached asset map indices for the built-in entity stat types: Health, Oxygen, Stamina, Mana, SignatureEnergy, and Ammo. Indices are updated via `update()` after the `EntityStatType` asset map is loaded.

## Methods

- public static int getHealth()
- public static int getOxygen()
- public static int getStamina()
- public static int getMana()
- public static int getSignatureEnergy()
- public static int getAmmo()
- public static void update()

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
