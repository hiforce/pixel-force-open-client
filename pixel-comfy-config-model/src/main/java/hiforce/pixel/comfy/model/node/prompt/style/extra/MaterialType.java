package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum MaterialType implements IExtraStyleType {

    None("None"),
    Blobby("Physical Properties - Blobby"),
    Blobs("Physical Properties - Blobs"),
    Cracks("Physical Properties - Cracks"),
    Cracked("Physical Properties - Cracked"),
    Corroded("Physical Properties - Corroded"),
    Dirty("Physical Properties - Dirty"),
    With_Imperfections("Physical Properties - With Imperfections"),
    Carbonated("Physical Properties - Carbonated"),
    Effervescent("Physical Properties - Effervescent"),
    Icy("Physical Properties - Icy"),
    Charred("Physical Properties - Charred"),
    Corrugated("Physical Properties - Corrugated"),
    Perforated("Physical Properties - Perforated"),
    Hydrophobic("Physical Properties - Hydrophobic"),
    Soft("Hardness Phases - Soft"),
    Hard("Hardness Phases - Hard"),
    Soft_Body("Hardness Phases - Soft Body"),
    Squishy("Hardness Phases - Squishy"),
    Solid("Hardness Phases - Solid"),
    Melting("Hardness Phases - Melting"),
    Freezing("Hardness Phases - Freezing"),
    Vaporization("Hardness Phases - Vaporization"),
    Condensation("Hardness Phases - Condensation"),
    Rough("Reflections Refractions - Rough"),
    Matte("Reflections Refractions - Matte"),
    Glossy("Reflections Refractions - Glossy"),
    Shiny("Reflections Refractions - Shiny"),
    Polished("Reflections Refractions - Polished"),
    Reflection("Reflections Refractions - Reflection"),
    Reflective("Reflections Refractions - Reflective"),
    RetroreFlective("Reflections Refractions - Retroreflective"),
    Refraction("Reflections Refractions - Refraction"),
    Refractive("Reflections Refractions - Refractive"),
    Caustics("Reflections Refractions - Caustics"),
    Glare("Reflections Refractions - Glare"),
    Specular_Highlights("Reflections Refractions - Specular Highlights"),
    Shimmer("Reflections Refractions - Shimmer"),
    Shimmering("Reflections Refractions - Shimmering"),
    Glimmering("Reflections Refractions - Glimmering"),
    Transparent("Optics Light Manipulation - Transparent"),
    Translucent("Optics Light Manipulation - Translucent"),
    Opaque("Optics Light Manipulation - Opaque"),
    Scattering("Optics Light Manipulation - Scattering"),
    Subsurface_Scattering("Optics Light Manipulation - Subsurface-Scattering"),
    Ambient_Occlusion("Optics Light Manipulation - Ambient Occlusion"),
    Opalescent("Optics Light Manipulation - Opalescent"),
    Polarized_or_Polarization("Optics Light Manipulation - Polarized or Polarization"),
    Solarized_or_Solarization("Optics Light Manipulation - Solarized or Solarization"),
    Iridescent("Optics Light Manipulation - Iridescent"),
    Dispersion("Optics Light Manipulation - Dispersion"),
    Chromatic("Optics Light Manipulation - Chromatic"),
    Prismatic("Optics Light Manipulation - Prismatic"),
    Sparkly_or_Glitter("Optics Light Manipulation - Sparkly or Glitter"),
    Glowing("Chromism Luminescence - Glowing"),
    Glowing_Neon("Chromism Luminescence - Glowing Neon"),
    Glow_In_The_Dark("Chromism Luminescence - Glow-In-The-Dark"),
    Radiant("Chromism Luminescence - Radiant"),
    Cherenkov_Radiation("Chromism Luminescence - Cherenkov Radiation"),
    Luminescence("Chromism Luminescence - Luminescence"),
    Bioluminescence("Chromism Luminescence - Bioluminescence"),
    Chromism("Chromism Luminescence - Chromism"),
    Piezochromism("Chromism Luminescence - Piezochromism"),
    Tribochromism("Chromism Luminescence - Tribochromism"),
    Metallochromism("Chromism Luminescence - Metallochromism"),
    Goniochromism("Chromism Luminescence - Goniochromism"),
    Hydrochromism("Chromism Luminescence - Hydrochromism");

    @Getter
    private final String value;

    MaterialType(String value) {
        this.value = value;
    }

}
