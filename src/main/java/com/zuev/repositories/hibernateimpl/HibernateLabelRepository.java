package com.zuev.repositories.hibernateimpl;

import com.zuev.entities.Label;
import com.zuev.repositories.LabelRepository;
import org.hibernate.Session;

import java.util.List;

public class HibernateLabelRepository implements LabelRepository {





    @Override
    public Label getByld(Long aLong) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Label newLabel = session.get(Label.class, aLong);
        return newLabel;


        }






    @Override
    public List<Label> getAll() {
        return null;
    }

    @Override
    public Label save(Label label) {
        return null;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public void deleteByld(Long aLong) {

    }
}
