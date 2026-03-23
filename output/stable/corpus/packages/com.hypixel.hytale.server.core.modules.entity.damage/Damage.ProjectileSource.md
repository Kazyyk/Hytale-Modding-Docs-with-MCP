# Damage.ProjectileSource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: Damage.EntitySource

public static class Damage.ProjectileSource extends Damage.EntitySource

A Damage.EntitySource that additionally tracks the projectile entity responsible for the damage. The inherited `sourceRef` references the shooter, while `projectile` references the projectile entity itself.

## Constructor


public ProjectileSource(@Nonnull Ref<EntityStore> shooter, @Nonnull Ref<EntityStore> projectile)

Creates a projectile source linking the shooter and the projectile entity.

## Methods


@Nonnull
public Ref<EntityStore> getProjectile()

Returns the `Ref<EntityStore>` pointing to the projectile entity.

## Fields

- projectile | Ref<EntityStore> | protected final | Reference to the projectile entity.

## Related Types

- Damage -- the damage event
- Damage.EntitySource -- parent class for entity-originated damage
- Damage.Source -- root interface
