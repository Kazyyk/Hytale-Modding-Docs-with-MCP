# CosmeticsModule

Type: class | Package: com.hypixel.hytale.server.core.cosmetics | Extends: JavaPlugin

public class CosmeticsModule extends JavaPlugin

Module that initializes and manages the cosmetics subsystem.

## Constants

- PluginManifest MANIFEST

## Key Methods

- protected void setup()
- public CosmeticRegistry getRegistry()
- public Model createRandomModel(@Nonnull Random random)
- public Model createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)
- public Model createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin, float scale)
- public void validateSkin(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)
- public static CosmeticsModule get()
- public com.hypixel.hytale.protocol.PlayerSkin generateRandomSkin(@Nonnull Random random)
- public String getPartType()
- public String getPartId()
