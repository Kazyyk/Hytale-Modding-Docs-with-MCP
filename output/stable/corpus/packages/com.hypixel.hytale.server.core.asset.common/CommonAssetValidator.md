# CommonAssetValidator

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Implements: Validator<String>

public class CommonAssetValidator implements Validator<String>

Validates common asset references during asset loading. Checks that referenced assets exist in `CommonAssetRegistry`, have the required file extension, and reside within allowed root directories. Provides predefined validators for textures, models, animations, sounds, and icons.

## Predefined Validators

- TEXTURE_ITEM | png | Blocks, BlockTextures, Items, NPC, Resources, VFX
- TEXTURE_CHARACTER | png | Characters, NPC, Items, VFX
- MODEL_ITEM | blockymodel | Blocks, Items, Resources, NPC, VFX, Consumable
- MODEL_CHARACTER | blockymodel | Characters, NPC, Items, VFX
- ANIMATION_CHARACTER | blockyanim | Characters, NPC, Equipment, VFX, Items
- MUSIC | ogg | Music
- SOUNDS | ogg | Sounds

## Methods

- public void accept(@Nullable String asset, @Nonnull ValidationResults results)
- @Override public void updateSchema(SchemaContext context, @Nonnull Schema target)
