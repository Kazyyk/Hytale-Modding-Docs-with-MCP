import { defineCollection, z } from "astro:content";
import { docsLoader, i18nLoader } from "@astrojs/starlight/loaders";
import { docsSchema } from "@astrojs/starlight/schema";

export const collections = {
  docs: defineCollection({
    loader: docsLoader(),
    schema: docsSchema({
      extend: z.object({
        // Generator metadata
        kind: z.string().optional(),
        package: z.string().optional(),
        fqcn: z.string().optional(),
        api_surface: z
          .preprocess(
            (v) => (typeof v === "boolean" ? (v ? "public" : "internal") : v),
            z.enum(["public", "internal"]),
          )
          .optional(),
        since: z.string().optional(),
        generator_version: z.string().optional(),
        generated_at: z.string().optional(),

        // Type-specific
        superclass: z.string().optional(),
        interfaces: z.array(z.string()).optional(),
        cancellable: z.boolean().optional(),
        related: z
          .array(
            z.object({
              kind: z.string(),
              fqcn: z.string(),
              relationship: z.string(),
            }),
          )
          .optional(),
        tags: z.array(z.string()).optional(),
      }),
    }),
  }),
};