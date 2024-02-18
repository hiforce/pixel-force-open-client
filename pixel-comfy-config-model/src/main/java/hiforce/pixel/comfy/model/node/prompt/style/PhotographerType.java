package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PhotographerType implements IStyleType {

    Alberto_Seveso("Alberto Seveso"),
    Alex_Timmermans("Alex Timmermans"),
    Alfred_Stieglitz("Alfred Stieglitz"),
    Ando_Fuchs("Ando Fuchs"),
    Anne_Brigman("Anne Brigman"),
    August_Sander("August Sander"),
    Brandon_Woelfel("Brandon Woelfel"),
    Chris_Friel("Chris Friel"),
    David_LaChapelle("David LaChapelle"),
    Eugene_Atget("Eugene Atget"),
    Garry_Winograd("Garry Winograd"),
    George_Hurrell("George Hurrell"),
    Germaine_Krull("Germaine Krull"),
    Hans_Bellmer("Hans Bellmer"),
    Hayao_Miyazaki("Hayao Miyazaki"),
    James_Bidgood("James Bidgood"),
    Kim_Keever("Kim Keever"),
    Lee_Friedlander("Lee Friedlander"),
    Liam_Wong("Liam Wong"),
    Lotte_Reiniger("Lotte Reiniger"),
    Martin_Schoeller("Martin Schoeller"),
    Mickalene_Thomas("Mickalene Thomas"),
    Miko_Lagerstedt("Miko Lagerstedt"),
    Miles_Aldridge("Miles Aldridge"),
    Misha_Gordin("Misha Gordin"),
    Nan_Goldin("Nan Goldin"),
    Nathan_Wirth("Nathan Wirth"),
    Nick_Knight("Nick Knight"),
    Oleg_Oprisco("Oleg Oprisco"),
    Oskar_Fischinger("Oskar Fischinger"),
    Paolo_Roversi("Paolo Roversi"),
    Paul_Barson("Paul Barson"),
    Richard_Avedon("Richard Avedon"),
    Tim_Walker("Tim Walker"),
    Tyler_Shields("Tyler Shields"),
    Walker_Evans("Walker Evans"),
    Wes_Anderson("Wes Anderson"),
    Yousuf_Karsh("Yousuf Karsh");

    @Getter
    private final String value;


    PhotographerType(String value) {
        this.value = value;
    }

    @Override
    public String getName(){
        return value;
    };


    @Override
    public String getWords() {
        return "(in the style of " + getValue() + ")";
    }
}
