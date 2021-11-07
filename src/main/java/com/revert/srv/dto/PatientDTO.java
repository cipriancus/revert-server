package com.revert.srv.dto;

import lombok.Data;

@Data
public class PatientDTO {
    String patient_id;
    double age;
    double chemo_exposure;
    double fraction_genome_altered;
    double gene_panel;
    double mCRC_type;
    double metastasectomy;
    double metastases_site_first_bone;
    double metastases_site_first_brain;
    double metastases_site_first_gynecological;
    double metastases_site_first_liver;
    double metastases_site_first_ln;
    double metastases_site_first_lung;
    double metastases_site_first_pelvis;
    double metastases_site_first_peritoneum_omentum_abdomen;
    double metastatic_biopsy_site;
    double msi_score;
    double msi_status;
    double mutation_count;
    double overall_survival_months;
    double living_status;
    double other_metastasis_sites;
    double patient_tumor_grade;
    double primary_tumor_site;
    double primary_tumor_location;
    double sample_type;
    double sex;
    double specimen_type;
    double stage_at_diagnostic;
    double time_from_met_dx_to_sequencing;
    double time_to_81_months;
}
